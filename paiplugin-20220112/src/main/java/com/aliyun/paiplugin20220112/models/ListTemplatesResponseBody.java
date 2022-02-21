// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public ListTemplatesResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setData(ListTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListTemplatesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class ListTemplatesResponseBodyDataTemplates extends TeaModel {
        // 模板内容，长度:2-30
        @NameInMap("Content")
        public String content;

        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // 申请说明
        @NameInMap("Description")
        public String description;

        // Id UUId
        @NameInMap("Id")
        public String id;

        // 签名名称
        @NameInMap("Name")
        public String name;

        // 审核意见。
        @NameInMap("Reason")
        public String reason;

        // 签名Id
        @NameInMap("SignatureId")
        public String signatureId;

        // 审核状态
        // - 0 : 审核中
        // - 1 : 审核通过
        // - 2 : 审核不通过
        @NameInMap("Status")
        public Integer status;

        // 模板Code
        @NameInMap("TemplateCode")
        public String templateCode;

        // 模板类型：
        // 0：验证码。
        // 1：短信通知。
        // 2：推广短信。
        // 3：国际/港澳台消息。
        @NameInMap("Type")
        public Integer type;

        // 更新时间 (UTC+8)
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListTemplatesResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyDataTemplates self = new ListTemplatesResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyDataTemplates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTemplatesResponseBodyDataTemplates setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListTemplatesResponseBodyDataTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplatesResponseBodyDataTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTemplatesResponseBodyDataTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesResponseBodyDataTemplates setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListTemplatesResponseBodyDataTemplates setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public ListTemplatesResponseBodyDataTemplates setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTemplatesResponseBodyDataTemplates setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListTemplatesResponseBodyDataTemplates setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListTemplatesResponseBodyDataTemplates setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListTemplatesResponseBodyData extends TeaModel {
        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 模板列表
        @NameInMap("Templates")
        public java.util.List<ListTemplatesResponseBodyDataTemplates> templates;

        // 总模板数量
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyData self = new ListTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTemplatesResponseBodyData setTemplates(java.util.List<ListTemplatesResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<ListTemplatesResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

        public ListTemplatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
