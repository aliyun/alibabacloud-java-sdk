// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetCampaignResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCampaignResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCampaignResponseBody self = new GetCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCampaignResponseBody setData(GetCampaignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCampaignResponseBodyData getData() {
        return this.data;
    }

    public GetCampaignResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetCampaignResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCampaignResponseBodyData extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetCampaignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCampaignResponseBodyData self = new GetCampaignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCampaignResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetCampaignResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCampaignResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCampaignResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetCampaignResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
