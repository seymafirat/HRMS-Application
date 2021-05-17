package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitlesDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	private JobTitlesDao jobTitlesDao;
	@Autowired
	public JobTitleManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}
	
	
	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return jobTitlesDao.findAll();
	}

}
