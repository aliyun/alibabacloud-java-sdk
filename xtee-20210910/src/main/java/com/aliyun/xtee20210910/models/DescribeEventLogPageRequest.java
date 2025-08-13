// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>180650758xxxxxxx</p>
     */
    @NameInMap("accountIdPRP")
    public String accountIdPRP;

    /**
     * <strong>example:</strong>
     * <p>1737101348000</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <strong>example:</strong>
     * <p>rm0102</p>
     */
    @NameInMap("condition1AL")
    public String condition1AL;

    /**
     * <strong>example:</strong>
     * <p>rm0102</p>
     */
    @NameInMap("condition2AL")
    public String condition2AL;

    /**
     * <strong>example:</strong>
     * <p>rm0102</p>
     */
    @NameInMap("condition3AL")
    public String condition3AL;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("deviceTypeLRP")
    public String deviceTypeLRP;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxxx@123.com">xxxx@123.com</a></p>
     */
    @NameInMap("emailPRP")
    public String emailPRP;

    /**
     * <strong>example:</strong>
     * <p>1746669075000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>wrongPassword</p>
     */
    @NameInMap("failReasonLRP")
    public String failReasonLRP;

    /**
     * <strong>example:</strong>
     * <p>168.168.168.168</p>
     */
    @NameInMap("ipPRP")
    public String ipPRP;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("loginResultARP")
    public String loginResultARP;

    /**
     * <strong>example:</strong>
     * <p>PASSWORD</p>
     */
    @NameInMap("loginTypeLRP")
    public String loginTypeLRP;

    /**
     * <strong>example:</strong>
     * <p>00-1C-F0-1D-A7-81</p>
     */
    @NameInMap("macPRP")
    public String macPRP;

    /**
     * <strong>example:</strong>
     * <p>17600000000</p>
     */
    @NameInMap("mobilePRP")
    public String mobilePRP;

    @NameInMap("nickNamePRP")
    public String nickNamePRP;

    /**
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("operateSourceLRP")
    public String operateSourceLRP;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>refer</p>
     */
    @NameInMap("referPRP")
    public String referPRP;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>168.168.168.168</p>
     */
    @NameInMap("registerIpPRP")
    public String registerIpPRP;

    /**
     * <p>requestId。</p>
     * 
     * <strong>example:</strong>
     * <p>BD6B08EC-1B44-5378-8838-C76A36415C55</p>
     */
    @NameInMap("reqIdPBS")
    public String reqIdPBS;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("scoreEBS")
    public Integer scoreEBS;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scoreSBS")
    public Integer scoreSBS;

    /**
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("serviceABS")
    public String serviceABS;

    /**
     * <strong>example:</strong>
     * <p>rg0001</p>
     */
    @NameInMap("tagsLBS")
    public String tagsLBS;

    @NameInMap("umidPDI")
    public String umidPDI;

    /**
     * <strong>example:</strong>
     * <p>00-1C-F0-1D-A7-81</p>
     */
    @NameInMap("userAgentPRP")
    public String userAgentPRP;

    /**
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("userNameTypeLRP")
    public String userNameTypeLRP;

    public static DescribeEventLogPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogPageRequest self = new DescribeEventLogPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventLogPageRequest setAccountIdPRP(String accountIdPRP) {
        this.accountIdPRP = accountIdPRP;
        return this;
    }
    public String getAccountIdPRP() {
        return this.accountIdPRP;
    }

    public DescribeEventLogPageRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeEventLogPageRequest setCondition1AL(String condition1AL) {
        this.condition1AL = condition1AL;
        return this;
    }
    public String getCondition1AL() {
        return this.condition1AL;
    }

    public DescribeEventLogPageRequest setCondition2AL(String condition2AL) {
        this.condition2AL = condition2AL;
        return this;
    }
    public String getCondition2AL() {
        return this.condition2AL;
    }

    public DescribeEventLogPageRequest setCondition3AL(String condition3AL) {
        this.condition3AL = condition3AL;
        return this;
    }
    public String getCondition3AL() {
        return this.condition3AL;
    }

    public DescribeEventLogPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventLogPageRequest setDeviceTypeLRP(String deviceTypeLRP) {
        this.deviceTypeLRP = deviceTypeLRP;
        return this;
    }
    public String getDeviceTypeLRP() {
        return this.deviceTypeLRP;
    }

    public DescribeEventLogPageRequest setEmailPRP(String emailPRP) {
        this.emailPRP = emailPRP;
        return this;
    }
    public String getEmailPRP() {
        return this.emailPRP;
    }

    public DescribeEventLogPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeEventLogPageRequest setFailReasonLRP(String failReasonLRP) {
        this.failReasonLRP = failReasonLRP;
        return this;
    }
    public String getFailReasonLRP() {
        return this.failReasonLRP;
    }

    public DescribeEventLogPageRequest setIpPRP(String ipPRP) {
        this.ipPRP = ipPRP;
        return this;
    }
    public String getIpPRP() {
        return this.ipPRP;
    }

    public DescribeEventLogPageRequest setLoginResultARP(String loginResultARP) {
        this.loginResultARP = loginResultARP;
        return this;
    }
    public String getLoginResultARP() {
        return this.loginResultARP;
    }

    public DescribeEventLogPageRequest setLoginTypeLRP(String loginTypeLRP) {
        this.loginTypeLRP = loginTypeLRP;
        return this;
    }
    public String getLoginTypeLRP() {
        return this.loginTypeLRP;
    }

    public DescribeEventLogPageRequest setMacPRP(String macPRP) {
        this.macPRP = macPRP;
        return this;
    }
    public String getMacPRP() {
        return this.macPRP;
    }

    public DescribeEventLogPageRequest setMobilePRP(String mobilePRP) {
        this.mobilePRP = mobilePRP;
        return this;
    }
    public String getMobilePRP() {
        return this.mobilePRP;
    }

    public DescribeEventLogPageRequest setNickNamePRP(String nickNamePRP) {
        this.nickNamePRP = nickNamePRP;
        return this;
    }
    public String getNickNamePRP() {
        return this.nickNamePRP;
    }

    public DescribeEventLogPageRequest setOperateSourceLRP(String operateSourceLRP) {
        this.operateSourceLRP = operateSourceLRP;
        return this;
    }
    public String getOperateSourceLRP() {
        return this.operateSourceLRP;
    }

    public DescribeEventLogPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventLogPageRequest setReferPRP(String referPRP) {
        this.referPRP = referPRP;
        return this;
    }
    public String getReferPRP() {
        return this.referPRP;
    }

    public DescribeEventLogPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventLogPageRequest setRegisterIpPRP(String registerIpPRP) {
        this.registerIpPRP = registerIpPRP;
        return this;
    }
    public String getRegisterIpPRP() {
        return this.registerIpPRP;
    }

    public DescribeEventLogPageRequest setReqIdPBS(String reqIdPBS) {
        this.reqIdPBS = reqIdPBS;
        return this;
    }
    public String getReqIdPBS() {
        return this.reqIdPBS;
    }

    public DescribeEventLogPageRequest setScoreEBS(Integer scoreEBS) {
        this.scoreEBS = scoreEBS;
        return this;
    }
    public Integer getScoreEBS() {
        return this.scoreEBS;
    }

    public DescribeEventLogPageRequest setScoreSBS(Integer scoreSBS) {
        this.scoreSBS = scoreSBS;
        return this;
    }
    public Integer getScoreSBS() {
        return this.scoreSBS;
    }

    public DescribeEventLogPageRequest setServiceABS(String serviceABS) {
        this.serviceABS = serviceABS;
        return this;
    }
    public String getServiceABS() {
        return this.serviceABS;
    }

    public DescribeEventLogPageRequest setTagsLBS(String tagsLBS) {
        this.tagsLBS = tagsLBS;
        return this;
    }
    public String getTagsLBS() {
        return this.tagsLBS;
    }

    public DescribeEventLogPageRequest setUmidPDI(String umidPDI) {
        this.umidPDI = umidPDI;
        return this;
    }
    public String getUmidPDI() {
        return this.umidPDI;
    }

    public DescribeEventLogPageRequest setUserAgentPRP(String userAgentPRP) {
        this.userAgentPRP = userAgentPRP;
        return this;
    }
    public String getUserAgentPRP() {
        return this.userAgentPRP;
    }

    public DescribeEventLogPageRequest setUserNameTypeLRP(String userNameTypeLRP) {
        this.userNameTypeLRP = userNameTypeLRP;
        return this;
    }
    public String getUserNameTypeLRP() {
        return this.userNameTypeLRP;
    }

}
