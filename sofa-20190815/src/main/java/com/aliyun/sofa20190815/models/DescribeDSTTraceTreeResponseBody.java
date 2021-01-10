// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TreeItems")
    public java.util.List<DescribeDSTTraceTreeResponseBodyTreeItems> treeItems;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDSTTraceTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceTreeResponseBody self = new DescribeDSTTraceTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTTraceTreeResponseBody setTreeItems(java.util.List<DescribeDSTTraceTreeResponseBodyTreeItems> treeItems) {
        this.treeItems = treeItems;
        return this;
    }
    public java.util.List<DescribeDSTTraceTreeResponseBodyTreeItems> getTreeItems() {
        return this.treeItems;
    }

    public DescribeDSTTraceTreeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTTraceTreeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeDSTTraceTreeResponseBodyTreeItemsDetails extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTraceTreeResponseBodyTreeItemsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTraceTreeResponseBodyTreeItemsDetails self = new DescribeDSTTraceTreeResponseBodyTreeItemsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTraceTreeResponseBodyTreeItemsDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItemsDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTraceTreeResponseBodyTreeItems extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("BasicInfo")
        public String basicInfo;

        @NameInMap("ItemParentId")
        public String itemParentId;

        @NameInMap("HasLog")
        public Boolean hasLog;

        @NameInMap("Result")
        public String result;

        @NameInMap("SpanId")
        public String spanId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Details")
        public java.util.List<DescribeDSTTraceTreeResponseBodyTreeItemsDetails> details;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("App")
        public String app;

        @NameInMap("Duration")
        public Long duration;

        public static DescribeDSTTraceTreeResponseBodyTreeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTraceTreeResponseBodyTreeItems self = new DescribeDSTTraceTreeResponseBodyTreeItems();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setBasicInfo(String basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public String getBasicInfo() {
            return this.basicInfo;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setItemParentId(String itemParentId) {
            this.itemParentId = itemParentId;
            return this;
        }
        public String getItemParentId() {
            return this.itemParentId;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setHasLog(Boolean hasLog) {
            this.hasLog = hasLog;
            return this;
        }
        public Boolean getHasLog() {
            return this.hasLog;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setDetails(java.util.List<DescribeDSTTraceTreeResponseBodyTreeItemsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeDSTTraceTreeResponseBodyTreeItemsDetails> getDetails() {
            return this.details;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeDSTTraceTreeResponseBodyTreeItems setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

}
