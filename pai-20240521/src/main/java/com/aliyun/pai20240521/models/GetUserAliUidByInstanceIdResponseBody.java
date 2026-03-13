// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class GetUserAliUidByInstanceIdResponseBody extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cpus")
    public Long cpus;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("IntranetIp")
    public String intranetIp;

    @NameInMap("Memory")
    public Long memory;

    @NameInMap("Message")
    public String message;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("PodUid")
    public String podUid;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResouceType")
    public String resouceType;

    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public Long updateTime;

    @NameInMap("UserUid")
    public String userUid;

    public static GetUserAliUidByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAliUidByInstanceIdResponseBody self = new GetUserAliUidByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAliUidByInstanceIdResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetUserAliUidByInstanceIdResponseBody setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetUserAliUidByInstanceIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserAliUidByInstanceIdResponseBody setCpus(Long cpus) {
        this.cpus = cpus;
        return this;
    }
    public Long getCpus() {
        return this.cpus;
    }

    public GetUserAliUidByInstanceIdResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetUserAliUidByInstanceIdResponseBody setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public GetUserAliUidByInstanceIdResponseBody setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public GetUserAliUidByInstanceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserAliUidByInstanceIdResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetUserAliUidByInstanceIdResponseBody setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public GetUserAliUidByInstanceIdResponseBody setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public GetUserAliUidByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAliUidByInstanceIdResponseBody setResouceType(String resouceType) {
        this.resouceType = resouceType;
        return this;
    }
    public String getResouceType() {
        return this.resouceType;
    }

    public GetUserAliUidByInstanceIdResponseBody setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public GetUserAliUidByInstanceIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUserAliUidByInstanceIdResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public GetUserAliUidByInstanceIdResponseBody setUserUid(String userUid) {
        this.userUid = userUid;
        return this;
    }
    public String getUserUid() {
        return this.userUid;
    }

}
