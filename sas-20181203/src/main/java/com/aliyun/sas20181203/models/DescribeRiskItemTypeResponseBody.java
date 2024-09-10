// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskItemTypeResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the type of the check item.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeRiskItemTypeResponseBodyList> list;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3B3F3A90-46A5-4023-A2D8-D68B14262F96</p>
     */
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
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>37625</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the check type.</p>
         * 
         * <strong>example:</strong>
         * <p>Identity authentication and permissions</p>
         */
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
