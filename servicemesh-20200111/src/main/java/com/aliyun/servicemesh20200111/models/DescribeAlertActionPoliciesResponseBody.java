// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAlertActionPoliciesResponseBody extends TeaModel {
    @NameInMap("ActionPolicyList")
    public java.util.List<DescribeAlertActionPoliciesResponseBodyActionPolicyList> actionPolicyList;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAlertActionPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertActionPoliciesResponseBody self = new DescribeAlertActionPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertActionPoliciesResponseBody setActionPolicyList(java.util.List<DescribeAlertActionPoliciesResponseBodyActionPolicyList> actionPolicyList) {
        this.actionPolicyList = actionPolicyList;
        return this;
    }
    public java.util.List<DescribeAlertActionPoliciesResponseBodyActionPolicyList> getActionPolicyList() {
        return this.actionPolicyList;
    }

    public DescribeAlertActionPoliciesResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    public DescribeAlertActionPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAlertActionPoliciesResponseBodyActionPolicyList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static DescribeAlertActionPoliciesResponseBodyActionPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertActionPoliciesResponseBodyActionPolicyList self = new DescribeAlertActionPoliciesResponseBodyActionPolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertActionPoliciesResponseBodyActionPolicyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAlertActionPoliciesResponseBodyActionPolicyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
