// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTSlsConfigResponseBody extends TeaModel {
    @NameInMap("SupportBizLog")
    public Boolean supportBizLog;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("SlsMachineGroup")
    public String slsMachineGroup;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("OpenStatus")
    public String openStatus;

    @NameInMap("TokenRedirectUrl")
    public String tokenRedirectUrl;

    @NameInMap("Type")
    public String type;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TokenValid")
    public Boolean tokenValid;

    @NameInMap("Valid")
    public Boolean valid;

    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDSTSlsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTSlsConfigResponseBody self = new DescribeDSTSlsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTSlsConfigResponseBody setSupportBizLog(Boolean supportBizLog) {
        this.supportBizLog = supportBizLog;
        return this;
    }
    public Boolean getSupportBizLog() {
        return this.supportBizLog;
    }

    public DescribeDSTSlsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTSlsConfigResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDSTSlsConfigResponseBody setSlsMachineGroup(String slsMachineGroup) {
        this.slsMachineGroup = slsMachineGroup;
        return this;
    }
    public String getSlsMachineGroup() {
        return this.slsMachineGroup;
    }

    public DescribeDSTSlsConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTSlsConfigResponseBody setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public String getOpenStatus() {
        return this.openStatus;
    }

    public DescribeDSTSlsConfigResponseBody setTokenRedirectUrl(String tokenRedirectUrl) {
        this.tokenRedirectUrl = tokenRedirectUrl;
        return this;
    }
    public String getTokenRedirectUrl() {
        return this.tokenRedirectUrl;
    }

    public DescribeDSTSlsConfigResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDSTSlsConfigResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeDSTSlsConfigResponseBody setTokenValid(Boolean tokenValid) {
        this.tokenValid = tokenValid;
        return this;
    }
    public Boolean getTokenValid() {
        return this.tokenValid;
    }

    public DescribeDSTSlsConfigResponseBody setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public DescribeDSTSlsConfigResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public DescribeDSTSlsConfigResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeDSTSlsConfigResponseBody setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public DescribeDSTSlsConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
