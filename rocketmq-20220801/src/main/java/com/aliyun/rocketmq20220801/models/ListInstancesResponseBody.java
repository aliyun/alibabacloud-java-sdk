// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListInstancesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyDataListTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListInstancesResponseBodyDataListTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataListTags self = new ListInstancesResponseBodyDataListTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyDataListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyDataList extends TeaModel {
        /**
         * <p>The commodity code of the instance. The commodity code of a ApsaraMQ for RocketMQ 5.0 instance has a similar format as ons_rmqsub_public_cn.</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the instance expires.</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The number of consumer groups created in the instance.</p>
         */
        @NameInMap("groupCount")
        public Long groupCount;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The billing method of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PayAsYouGo: pay-as-you-go</p>
         * <p>*   Subscription</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The time when the instance was released.</p>
         */
        @NameInMap("releaseTime")
        public String releaseTime;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The primary edition of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   standard: Standard Edition</p>
         * <p>*   ultimate: Enterprise Platinum Edition</p>
         * <p>*   professional: Professional Edition</p>
         */
        @NameInMap("seriesCode")
        public String seriesCode;

        /**
         * <p>The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.</p>
         */
        @NameInMap("serviceCode")
        public String serviceCode;

        /**
         * <p>The time when the instance was started.</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RELEASED</p>
         * <p>*   RUNNING</p>
         * <p>*   STOPPED</p>
         * <p>*   CHANGING</p>
         * <p>*   CREATING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The sub-category edition of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   cluster_ha: Cluster High-availability Edition</p>
         * <p>*   single_node: Standalone Edition</p>
         */
        @NameInMap("subSeriesCode")
        public String subSeriesCode;

        @NameInMap("tags")
        public java.util.List<ListInstancesResponseBodyDataListTags> tags;

        /**
         * <p>The number of topics created in the instance.</p>
         */
        @NameInMap("topicCount")
        public Long topicCount;

        /**
         * <p>The time when the instance was last modified.</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The ID of the user who owns the instance.</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataList self = new ListInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInstancesResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListInstancesResponseBodyDataList setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public ListInstancesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyDataList setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyDataList setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ListInstancesResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListInstancesResponseBodyDataList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyDataList setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public ListInstancesResponseBodyDataList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListInstancesResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListInstancesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyDataList setSubSeriesCode(String subSeriesCode) {
            this.subSeriesCode = subSeriesCode;
            return this;
        }
        public String getSubSeriesCode() {
            return this.subSeriesCode;
        }

        public ListInstancesResponseBodyDataList setTags(java.util.List<ListInstancesResponseBodyDataListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataListTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyDataList setTopicCount(Long topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Long getTopicCount() {
            return this.topicCount;
        }

        public ListInstancesResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListInstancesResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("list")
        public java.util.List<ListInstancesResponseBodyDataList> list;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setList(java.util.List<ListInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListInstancesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
