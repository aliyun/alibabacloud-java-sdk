// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListCampaignsResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public ListCampaignsResponseBodyData data;

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

    public static ListCampaignsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsResponseBody self = new ListCampaignsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCampaignsResponseBody setData(ListCampaignsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCampaignsResponseBodyData getData() {
        return this.data;
    }

    public ListCampaignsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListCampaignsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCampaignsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCampaignsResponseBodyDataCampaigns extends TeaModel {
        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>运营活动Id。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>运营活动名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>备注。</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListCampaignsResponseBodyDataCampaigns build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyDataCampaigns self = new ListCampaignsResponseBodyDataCampaigns();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyDataCampaigns setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListCampaignsResponseBodyDataCampaigns setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCampaignsResponseBodyDataCampaigns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCampaignsResponseBodyDataCampaigns setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCampaignsResponseBodyDataCampaigns setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListCampaignsResponseBodyData extends TeaModel {
        /**
         * <p>运营活动列表。</p>
         */
        @NameInMap("Campaigns")
        public java.util.List<ListCampaignsResponseBodyDataCampaigns> campaigns;

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
         * <p>总运营活动数量。</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCampaignsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyData self = new ListCampaignsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyData setCampaigns(java.util.List<ListCampaignsResponseBodyDataCampaigns> campaigns) {
            this.campaigns = campaigns;
            return this;
        }
        public java.util.List<ListCampaignsResponseBodyDataCampaigns> getCampaigns() {
            return this.campaigns;
        }

        public ListCampaignsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCampaignsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCampaignsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
