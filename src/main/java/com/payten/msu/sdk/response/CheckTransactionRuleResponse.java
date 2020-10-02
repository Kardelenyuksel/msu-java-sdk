package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.TransactionRule;

public class CheckTransactionRuleResponse extends ApiResponse {
	@JsonProperty(value = "transactionRuleList")
	@XmlElementWrapper(name = "transactionRuleList")
	List<TransactionRule> transactionRuleList;

	public List<TransactionRule> getTransactionRuleList() {
		return transactionRuleList;
	}
}