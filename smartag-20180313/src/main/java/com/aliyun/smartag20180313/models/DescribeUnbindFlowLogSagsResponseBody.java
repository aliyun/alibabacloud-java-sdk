// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUnbindFlowLogSagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Sags")
    public DescribeUnbindFlowLogSagsResponseBodySags sags;

    public static DescribeUnbindFlowLogSagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnbindFlowLogSagsResponseBody self = new DescribeUnbindFlowLogSagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnbindFlowLogSagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUnbindFlowLogSagsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeUnbindFlowLogSagsResponseBody setSags(DescribeUnbindFlowLogSagsResponseBodySags sags) {
        this.sags = sags;
        return this;
    }
    public DescribeUnbindFlowLogSagsResponseBodySags getSags() {
        return this.sags;
    }

    public static class DescribeUnbindFlowLogSagsResponseBodySagsSag extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("Name")
        public String name;

        public static DescribeUnbindFlowLogSagsResponseBodySagsSag build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnbindFlowLogSagsResponseBodySagsSag self = new DescribeUnbindFlowLogSagsResponseBodySagsSag();
            return TeaModel.build(map, self);
        }

        public DescribeUnbindFlowLogSagsResponseBodySagsSag setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUnbindFlowLogSagsResponseBodySagsSag setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeUnbindFlowLogSagsResponseBodySagsSag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeUnbindFlowLogSagsResponseBodySags extends TeaModel {
        @NameInMap("Sag")
        public java.util.List<DescribeUnbindFlowLogSagsResponseBodySagsSag> sag;

        public static DescribeUnbindFlowLogSagsResponseBodySags build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnbindFlowLogSagsResponseBodySags self = new DescribeUnbindFlowLogSagsResponseBodySags();
            return TeaModel.build(map, self);
        }

        public DescribeUnbindFlowLogSagsResponseBodySags setSag(java.util.List<DescribeUnbindFlowLogSagsResponseBodySagsSag> sag) {
            this.sag = sag;
            return this;
        }
        public java.util.List<DescribeUnbindFlowLogSagsResponseBodySagsSag> getSag() {
            return this.sag;
        }

    }

}
