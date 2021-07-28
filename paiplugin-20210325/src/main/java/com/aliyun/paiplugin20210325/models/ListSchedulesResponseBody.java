// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class ListSchedulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSchedulesResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static ListSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesResponseBody self = new ListSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchedulesResponseBody setData(ListSchedulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSchedulesResponseBodyData getData() {
        return this.data;
    }

    public ListSchedulesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListSchedulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class ListSchedulesResponseBodyDataSchedules extends TeaModel {
        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // ID
        @NameInMap("ID")
        public String ID;

        // 发送计划名称
        @NameInMap("Name")
        public String name;

        // 发布时间 (UTC+8)
        @NameInMap("SendTime")
        public String sendTime;

        // 签名ID
        @NameInMap("SignatureID")
        public String signatureID;

        // 状态
        // - 0: 检查中
        // - 1: 检查成功
        // - 2: 检查失败
        // - 3: 发送中
        // - 4: 发送成功
        // - 5: 发送失败
        @NameInMap("Status")
        public Integer status;

        // 模板ID
        @NameInMap("TemplateID")
        public String templateID;

        // 更新时间 (UTC+8)
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListSchedulesResponseBodyDataSchedules build(java.util.Map<String, ?> map) throws Exception {
            ListSchedulesResponseBodyDataSchedules self = new ListSchedulesResponseBodyDataSchedules();
            return TeaModel.build(map, self);
        }

        public ListSchedulesResponseBodyDataSchedules setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListSchedulesResponseBodyDataSchedules setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public ListSchedulesResponseBodyDataSchedules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSchedulesResponseBodyDataSchedules setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public ListSchedulesResponseBodyDataSchedules setSignatureID(String signatureID) {
            this.signatureID = signatureID;
            return this;
        }
        public String getSignatureID() {
            return this.signatureID;
        }

        public ListSchedulesResponseBodyDataSchedules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSchedulesResponseBodyDataSchedules setTemplateID(String templateID) {
            this.templateID = templateID;
            return this;
        }
        public String getTemplateID() {
            return this.templateID;
        }

        public ListSchedulesResponseBodyDataSchedules setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListSchedulesResponseBodyData extends TeaModel {
        // 分页数，从1开始，默认为1
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10
        @NameInMap("PageSize")
        public Integer pageSize;

        // 发送计划列表
        @NameInMap("Schedules")
        public java.util.List<ListSchedulesResponseBodyDataSchedules> schedules;

        // 总发送计划数量
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSchedulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSchedulesResponseBodyData self = new ListSchedulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSchedulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSchedulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSchedulesResponseBodyData setSchedules(java.util.List<ListSchedulesResponseBodyDataSchedules> schedules) {
            this.schedules = schedules;
            return this;
        }
        public java.util.List<ListSchedulesResponseBodyDataSchedules> getSchedules() {
            return this.schedules;
        }

        public ListSchedulesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
