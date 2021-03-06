package com.buyi.pay.service.channel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.buyi.pay.Application;
import com.buyi.pay.common.enums.ChannelType;
import com.buyi.pay.vo.support.PayoutReq;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ChannelCompositeTest {
	@Resource
	private ChannleService channleService;

	@Test
	public void payout() {
		PayoutReq payoutReq = PayoutReq.newInstance().channelType(ChannelType.ALL_IN_PAY);

		channleService.payout(payoutReq);
	}

}
