// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskItemTypeResponseBody extends TeaModel {
    // An array that consists of the types of check items.
    @NameInMap("List")
    public java.util.List<DescribeRiskItemTypeResponseBodyList> list;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskItemTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskItemTypeResponseBody self = new DescribeRiskItemTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskItemTypeResponseBody setList(java.util.List<DescribeRiskItemTypeResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeRiskItemTypeResponseBodyList> getList() {
        return this.list;
    }

    public DescribeRiskItemTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRiskItemTypeResponseBodyList extends TeaModel {
        // The ID of the check item.
        @NameInMap("Id")
        public Long id;

        // The name of the check item type. Example: Identity authentication and permissions.
        @NameInMap("Title")
        public String title;

        public static DescribeRiskItemTypeResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskItemTypeResponseBodyList self = new DescribeRiskItemTypeResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskItemTypeResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRiskItemTypeResponseBodyList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
