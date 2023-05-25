// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingResponseBody extends TeaModel {
    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=DescribeOutlineBinding</p>
     * <p>&TenantId=t2mr3oae0****</p>
     * <p>&TableName=pay_online</p>
     * <p>&DatabaseName=testdb</p>
     * <p>&SQLId=8D6E84****0B8FB1823D199E2CA1****</p>
     * <p>&IsConcurrentLimit=false</p>
     * <p>&InstanceId=ob317v4uif****</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     */
    @NameInMap("OutlineBinding")
    public DescribeOutlineBindingResponseBodyOutlineBinding outlineBinding;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOutlineBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutlineBindingResponseBody self = new DescribeOutlineBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutlineBindingResponseBody setOutlineBinding(DescribeOutlineBindingResponseBodyOutlineBinding outlineBinding) {
        this.outlineBinding = outlineBinding;
        return this;
    }
    public DescribeOutlineBindingResponseBodyOutlineBinding getOutlineBinding() {
        return this.outlineBinding;
    }

    public DescribeOutlineBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOutlineBindingResponseBodyOutlineBinding extends TeaModel {
        @NameInMap("BindIndex")
        public String bindIndex;

        /**
         * <p>You can call this operation to query the outline binding information or throttling information of an SQL statement in the database based on an SQLID.</p>
         */
        @NameInMap("BindPlan")
        public String bindPlan;

        @NameInMap("MaxConcurrent")
        public Integer maxConcurrent;

        /**
         * <p>{"name":"DescribeOutlineBinding","product":"OceanBasePro","version":"2019-09-01","path":"/","deprecated":0,"method":"POST|GET","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"Action\",\"position\":\"Query\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"DescribeOutlineBinding\"},{\"name\":\"TenantId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"t2mr3oae0****\"},{\"name\":\"TableName\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"pay_online\"},{\"name\":\"DatabaseName\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"SQLId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"SQLID\",\"description\":\"SQLID。\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"},{\"name\":\"IsConcurrentLimit\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Boolean\",\"title\":\"\",\"description\":\"\",\"example\":\"false\"},{\"name\":\"InstanceId\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"ob317v4uif****\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"OutlineBinding\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Object\",\"children\":[{\"name\":\"BindPlan\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"PHY_TABLE_SCAN | bmsql_order_line | 40 ******\"},{\"name\":\"OutlineId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"OutlineID\",\"description\":\"OutlineID。\",\"example\":\"-1\"},{\"name\":\"BindIndex\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"PRIMARY\"},{\"name\":\"MaxConcurrent\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"2\"}],\"title\":\"\",\"description\":\"\"},{\"name\":\"RequestId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C\"}],\"title\":\"\",\"description\":\"\"}","errors":"{\"2014\":[{\"code\":\"2014\",\"defaultError\":false,\"errorCode\":\"InternalError\",\"errorMessage\":\"The request processing has failed due to some unknown error.\",\"errorMessageCn\":\"\",\"type\":\"user\"}]}"}</p>
         */
        @NameInMap("OutlineId")
        public Long outlineId;

        /**
         * <p>表名称</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeOutlineBindingResponseBodyOutlineBinding build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutlineBindingResponseBodyOutlineBinding self = new DescribeOutlineBindingResponseBodyOutlineBinding();
            return TeaModel.build(map, self);
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setBindIndex(String bindIndex) {
            this.bindIndex = bindIndex;
            return this;
        }
        public String getBindIndex() {
            return this.bindIndex;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setBindPlan(String bindPlan) {
            this.bindPlan = bindPlan;
            return this;
        }
        public String getBindPlan() {
            return this.bindPlan;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setMaxConcurrent(Integer maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
            return this;
        }
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
