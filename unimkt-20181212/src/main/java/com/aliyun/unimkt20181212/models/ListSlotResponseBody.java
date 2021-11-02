// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListSlotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListSlotResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlotResponseBody self = new ListSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSlotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSlotResponseBody setModel(java.util.List<ListSlotResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListSlotResponseBodyModel> getModel() {
        return this.model;
    }

    public ListSlotResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlotResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSlotResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSlotResponseBodyModel extends TeaModel {
        @NameInMap("AdSlotCorporateStatus")
        public String adSlotCorporateStatus;

        @NameInMap("AdSlotId")
        public String adSlotId;

        @NameInMap("AdSlotName")
        public String adSlotName;

        @NameInMap("AdSlotStatus")
        public String adSlotStatus;

        @NameInMap("AdSlotTemplateId")
        public String adSlotTemplateId;

        @NameInMap("AdSlotType")
        public String adSlotType;

        @NameInMap("BlockingRule")
        public String blockingRule;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("InspireScene")
        public String inspireScene;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static ListSlotResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListSlotResponseBodyModel self = new ListSlotResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListSlotResponseBodyModel setAdSlotCorporateStatus(String adSlotCorporateStatus) {
            this.adSlotCorporateStatus = adSlotCorporateStatus;
            return this;
        }
        public String getAdSlotCorporateStatus() {
            return this.adSlotCorporateStatus;
        }

        public ListSlotResponseBodyModel setAdSlotId(String adSlotId) {
            this.adSlotId = adSlotId;
            return this;
        }
        public String getAdSlotId() {
            return this.adSlotId;
        }

        public ListSlotResponseBodyModel setAdSlotName(String adSlotName) {
            this.adSlotName = adSlotName;
            return this;
        }
        public String getAdSlotName() {
            return this.adSlotName;
        }

        public ListSlotResponseBodyModel setAdSlotStatus(String adSlotStatus) {
            this.adSlotStatus = adSlotStatus;
            return this;
        }
        public String getAdSlotStatus() {
            return this.adSlotStatus;
        }

        public ListSlotResponseBodyModel setAdSlotTemplateId(String adSlotTemplateId) {
            this.adSlotTemplateId = adSlotTemplateId;
            return this;
        }
        public String getAdSlotTemplateId() {
            return this.adSlotTemplateId;
        }

        public ListSlotResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public ListSlotResponseBodyModel setBlockingRule(String blockingRule) {
            this.blockingRule = blockingRule;
            return this;
        }
        public String getBlockingRule() {
            return this.blockingRule;
        }

        public ListSlotResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSlotResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListSlotResponseBodyModel setInspireScene(String inspireScene) {
            this.inspireScene = inspireScene;
            return this;
        }
        public String getInspireScene() {
            return this.inspireScene;
        }

        public ListSlotResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListSlotResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ListSlotResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListSlotResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListSlotResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
