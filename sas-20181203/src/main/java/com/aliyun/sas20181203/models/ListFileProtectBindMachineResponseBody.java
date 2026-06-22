// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectBindMachineResponseBody extends TeaModel {
    /**
     * <p>The list of servers. The UUID of each server is returned.</p>
     */
    @NameInMap("List")
    public java.util.List<String> list;

    /**
     * <p>The paging information for the paged query.</p>
     */
    @NameInMap("PageInfo")
    public ListFileProtectBindMachineResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectBindMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectBindMachineResponseBody self = new ListFileProtectBindMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectBindMachineResponseBody setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

    public ListFileProtectBindMachineResponseBody setPageInfo(ListFileProtectBindMachineResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListFileProtectBindMachineResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListFileProtectBindMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileProtectBindMachineResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries on the current page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListFileProtectBindMachineResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectBindMachineResponseBodyPageInfo self = new ListFileProtectBindMachineResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListFileProtectBindMachineResponseBodyPageInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListFileProtectBindMachineResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
