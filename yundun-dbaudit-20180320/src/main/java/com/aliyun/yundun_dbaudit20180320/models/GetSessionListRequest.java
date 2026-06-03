// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ActionList")
    public java.util.List<String> actionList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-06 00:00:00</p>
     */
    @NameInMap("BeginDate")
    public String beginDate;

    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ClientIpList")
    public java.util.List<String> clientIpList;

    /**
     * <strong>example:</strong>
     * <p>navicat</p>
     */
    @NameInMap("ClientProgramList")
    public java.util.List<String> clientProgramList;

    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DbHostList")
    public java.util.List<String> dbHostList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DbUserList")
    public java.util.List<String> dbUserList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-06 23:59:59</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3011610850021000000</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetSessionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSessionListRequest self = new GetSessionListRequest();
        return TeaModel.build(map, self);
    }

    public GetSessionListRequest setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public GetSessionListRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetSessionListRequest setClientIpList(java.util.List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    public GetSessionListRequest setClientProgramList(java.util.List<String> clientProgramList) {
        this.clientProgramList = clientProgramList;
        return this;
    }
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

    public GetSessionListRequest setDbHostList(java.util.List<String> dbHostList) {
        this.dbHostList = dbHostList;
        return this;
    }
    public java.util.List<String> getDbHostList() {
        return this.dbHostList;
    }

    public GetSessionListRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetSessionListRequest setDbUserList(java.util.List<String> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    public GetSessionListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetSessionListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSessionListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetSessionListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSessionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSessionListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSessionListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
