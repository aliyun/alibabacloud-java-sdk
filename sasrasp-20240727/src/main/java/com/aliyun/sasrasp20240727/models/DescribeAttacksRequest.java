// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasrasp20240727.models;

import com.aliyun.tea.*;

public class DescribeAttacksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <strong>example:</strong>
     * <p>67e283ee866f097cf07d****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AttackHostId")
    public String attackHostId;

    /**
     * <strong>example:</strong>
     * <p>sql</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <strong>example:</strong>
     * <p><a href="http://aliyun.com">http://aliyun.com</a></p>
     */
    @NameInMap("AttackUrl")
    public String attackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1737216000000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("HandleStatus")
    public Integer handleStatus;

    /**
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("HandlerType")
    public String handlerType;

    /**
     * <strong>example:</strong>
     * <p>lshm-sec-waf-new-38</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Pid")
    public String pid;

    /**
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("RaspType")
    public String raspType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("Remote")
    public String remote;

    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1727281449756</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <strong>example:</strong>
     * <p>2d14556b77cf1bf7c696e010aaa*****</p>
     */
    @NameInMap("UnionId")
    public String unionId;

    public static DescribeAttacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttacksRequest self = new DescribeAttacksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttacksRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public DescribeAttacksRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeAttacksRequest setAttackHostId(String attackHostId) {
        this.attackHostId = attackHostId;
        return this;
    }
    public String getAttackHostId() {
        return this.attackHostId;
    }

    public DescribeAttacksRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeAttacksRequest setAttackUrl(String attackUrl) {
        this.attackUrl = attackUrl;
        return this;
    }
    public String getAttackUrl() {
        return this.attackUrl;
    }

    public DescribeAttacksRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeAttacksRequest setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }
    public Integer getHandleStatus() {
        return this.handleStatus;
    }

    public DescribeAttacksRequest setHandlerType(String handlerType) {
        this.handlerType = handlerType;
        return this;
    }
    public String getHandlerType() {
        return this.handlerType;
    }

    public DescribeAttacksRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeAttacksRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeAttacksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAttacksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAttacksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAttacksRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DescribeAttacksRequest setRaspType(String raspType) {
        this.raspType = raspType;
        return this;
    }
    public String getRaspType() {
        return this.raspType;
    }

    public DescribeAttacksRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAttacksRequest setRemote(String remote) {
        this.remote = remote;
        return this;
    }
    public String getRemote() {
        return this.remote;
    }

    public DescribeAttacksRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DescribeAttacksRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeAttacksRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

}
