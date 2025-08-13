// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSelectItemResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeSelectItemResponseBodyResultObject resultObject;

    public static DescribeSelectItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSelectItemResponseBody self = new DescribeSelectItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSelectItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSelectItemResponseBody setResultObject(DescribeSelectItemResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSelectItemResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSelectItemResponseBodyResultObject extends TeaModel {
        /**
         * <p>Monitoring status list.</p>
         */
        @NameInMap("monitorStatusList")
        public java.util.List<String> monitorStatusList;

        /**
         * <p>Task ID list.</p>
         */
        @NameInMap("taskIdList")
        public java.util.List<String> taskIdList;

        public static DescribeSelectItemResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSelectItemResponseBodyResultObject self = new DescribeSelectItemResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSelectItemResponseBodyResultObject setMonitorStatusList(java.util.List<String> monitorStatusList) {
            this.monitorStatusList = monitorStatusList;
            return this;
        }
        public java.util.List<String> getMonitorStatusList() {
            return this.monitorStatusList;
        }

        public DescribeSelectItemResponseBodyResultObject setTaskIdList(java.util.List<String> taskIdList) {
            this.taskIdList = taskIdList;
            return this;
        }
        public java.util.List<String> getTaskIdList() {
            return this.taskIdList;
        }

    }

}
