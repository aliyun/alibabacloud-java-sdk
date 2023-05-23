// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListSchedulesResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public ListSchedulesResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSchedulesResponseBodyDataSchedules extends TeaModel {
        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>终止时间（UTC+8）。</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>执行时间 (UTC+8)，为空立即执行。</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>人群ID。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>触达计划ID。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>触达计划名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>重复周期，按重复周期与重复周期单位执行。</p>
         */
        @NameInMap("RepeatCycle")
        public Integer repeatCycle;

        /**
         * <p>重复周期单位，若指定执行时间，则重复周期生效。</p>
         * <p>- 0: 从不（默认）。</p>
         * <p>- 1: 小时。</p>
         * <p>- 2: 天。</p>
         * <p>- 3: 周。</p>
         * <p>- 4: 月。</p>
         */
        @NameInMap("RepeatCycleUnit")
        public Integer repeatCycleUnit;

        /**
         * <p>重复次数。</p>
         * <p>- 0: 不设终止时间（默认）。</p>
         * <p>- N: 重复N次后终止。</p>
         */
        @NameInMap("RepeatTimes")
        public Integer repeatTimes;

        /**
         * <p>签名。</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>签名ID，或指定签名。</p>
         */
        @NameInMap("SignatureId")
        public String signatureId;

        /**
         * <p>状态。</p>
         * <p>- 0: 检查中。</p>
         * <p>- 1: 检查成功。</p>
         * <p>- 2: 检查失败。</p>
         * <p>- 3: 发送中。</p>
         * <p>- 4: 发送成功。</p>
         * <p>- 5: 发送失败。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>模板Code。</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>模板ID，或指定模板Code。</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
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

        public ListSchedulesResponseBodyDataSchedules setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public ListSchedulesResponseBodyDataSchedules setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public ListSchedulesResponseBodyDataSchedules setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListSchedulesResponseBodyDataSchedules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSchedulesResponseBodyDataSchedules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSchedulesResponseBodyDataSchedules setRepeatCycle(Integer repeatCycle) {
            this.repeatCycle = repeatCycle;
            return this;
        }
        public Integer getRepeatCycle() {
            return this.repeatCycle;
        }

        public ListSchedulesResponseBodyDataSchedules setRepeatCycleUnit(Integer repeatCycleUnit) {
            this.repeatCycleUnit = repeatCycleUnit;
            return this;
        }
        public Integer getRepeatCycleUnit() {
            return this.repeatCycleUnit;
        }

        public ListSchedulesResponseBodyDataSchedules setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public ListSchedulesResponseBodyDataSchedules setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public ListSchedulesResponseBodyDataSchedules setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public ListSchedulesResponseBodyDataSchedules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSchedulesResponseBodyDataSchedules setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListSchedulesResponseBodyDataSchedules setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
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
        /**
         * <p>分页数，从1开始，默认为1。</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>分页大小，默认为10。</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>触达计划列表。</p>
         */
        @NameInMap("Schedules")
        public java.util.List<ListSchedulesResponseBodyDataSchedules> schedules;

        /**
         * <p>触达计划数量。</p>
         */
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
