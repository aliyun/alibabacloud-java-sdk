// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCrowdsResponseBody extends TeaModel {
    @NameInMap("Crowds")
    public java.util.List<ListCrowdsResponseBodyCrowds> crowds;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCrowdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrowdsResponseBody self = new ListCrowdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrowdsResponseBody setCrowds(java.util.List<ListCrowdsResponseBodyCrowds> crowds) {
        this.crowds = crowds;
        return this;
    }
    public java.util.List<ListCrowdsResponseBodyCrowds> getCrowds() {
        return this.crowds;
    }

    public ListCrowdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrowdsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCrowdsResponseBodyCrowds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CrowdId")
        public String crowdId;

        /**
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>os=android</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>crowd1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <strong>example:</strong>
         * <p>ManualInput</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>user1,user2</p>
         */
        @NameInMap("Users")
        public String users;

        public static ListCrowdsResponseBodyCrowds build(java.util.Map<String, ?> map) throws Exception {
            ListCrowdsResponseBodyCrowds self = new ListCrowdsResponseBodyCrowds();
            return TeaModel.build(map, self);
        }

        public ListCrowdsResponseBodyCrowds setCrowdId(String crowdId) {
            this.crowdId = crowdId;
            return this;
        }
        public String getCrowdId() {
            return this.crowdId;
        }

        public ListCrowdsResponseBodyCrowds setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCrowdsResponseBodyCrowds setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListCrowdsResponseBodyCrowds setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListCrowdsResponseBodyCrowds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCrowdsResponseBodyCrowds setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public ListCrowdsResponseBodyCrowds setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListCrowdsResponseBodyCrowds setUsers(String users) {
            this.users = users;
            return this;
        }
        public String getUsers() {
            return this.users;
        }

    }

}
