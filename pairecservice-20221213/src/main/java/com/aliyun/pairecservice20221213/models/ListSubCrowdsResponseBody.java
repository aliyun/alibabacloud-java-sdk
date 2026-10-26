// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListSubCrowdsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C5AEB79E-FAA4-5DCE-8CD7-1CAF549ECC3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of sub-crowds.</p>
     */
    @NameInMap("SubCrowds")
    public java.util.List<ListSubCrowdsResponseBodySubCrowds> subCrowds;

    /**
     * <p>The total number of elements in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSubCrowdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubCrowdsResponseBody self = new ListSubCrowdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubCrowdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubCrowdsResponseBody setSubCrowds(java.util.List<ListSubCrowdsResponseBodySubCrowds> subCrowds) {
        this.subCrowds = subCrowds;
        return this;
    }
    public java.util.List<ListSubCrowdsResponseBodySubCrowds> getSubCrowds() {
        return this.subCrowds;
    }

    public ListSubCrowdsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubCrowdsResponseBodySubCrowds extends TeaModel {
        /**
         * <p>The creation time. The value is in ISO 8601 format and includes a time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The number of users in the crowd group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <p>The crowd source. Valid values:
         * ● ManualInput: Manual data entry.
         * ● UploadFile: File upload.</p>
         * 
         * <strong>example:</strong>
         * <p>ManualInput</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The sub-crowd ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SubCrowdId")
        public String subCrowdId;

        /**
         * <p>The users in the crowd group.</p>
         * 
         * <strong>example:</strong>
         * <p>user1,user2</p>
         */
        @NameInMap("Users")
        public String users;

        public static ListSubCrowdsResponseBodySubCrowds build(java.util.Map<String, ?> map) throws Exception {
            ListSubCrowdsResponseBodySubCrowds self = new ListSubCrowdsResponseBodySubCrowds();
            return TeaModel.build(map, self);
        }

        public ListSubCrowdsResponseBodySubCrowds setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListSubCrowdsResponseBodySubCrowds setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ListSubCrowdsResponseBodySubCrowds setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListSubCrowdsResponseBodySubCrowds setSubCrowdId(String subCrowdId) {
            this.subCrowdId = subCrowdId;
            return this;
        }
        public String getSubCrowdId() {
            return this.subCrowdId;
        }

        public ListSubCrowdsResponseBodySubCrowds setUsers(String users) {
            this.users = users;
            return this;
        }
        public String getUsers() {
            return this.users;
        }

    }

}
