// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListSubCrowdsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCrowds")
    public java.util.List<ListSubCrowdsResponseBodySubCrowds> subCrowds;

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
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("Source")
        public String source;

        @NameInMap("SubCrowdId")
        public String subCrowdId;

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
