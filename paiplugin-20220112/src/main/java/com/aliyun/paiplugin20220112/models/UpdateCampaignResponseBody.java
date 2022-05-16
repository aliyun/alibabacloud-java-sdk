// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class UpdateCampaignResponseBody extends TeaModel {
    // 返回数据。
    @NameInMap("Data")
    public UpdateCampaignResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCampaignResponseBody self = new UpdateCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCampaignResponseBody setData(UpdateCampaignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCampaignResponseBodyData getData() {
        return this.data;
    }

    public UpdateCampaignResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateCampaignResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateCampaignResponseBodyData extends TeaModel {
        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 运营活动Id。
        @NameInMap("Id")
        public String id;

        // 运营活动名称。
        @NameInMap("Name")
        public String name;

        // 备注。
        @NameInMap("Remark")
        public String remark;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static UpdateCampaignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCampaignResponseBodyData self = new UpdateCampaignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCampaignResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public UpdateCampaignResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCampaignResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCampaignResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UpdateCampaignResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
