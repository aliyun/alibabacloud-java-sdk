// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTSpansRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Component")
    public String component;

    @NameInMap("CustomTags")
    public java.util.List<ListDSTSpansRequestCustomTags> customTags;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Kind")
    public String kind;

    @NameInMap("LocalServiceName")
    public String localServiceName;

    @NameInMap("MaxDuration")
    public Long maxDuration;

    @NameInMap("MiddlewareTags")
    public java.util.List<ListDSTSpansRequestMiddlewareTags> middlewareTags;

    @NameInMap("MinDuration")
    public Long minDuration;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RemoteServiceName")
    public String remoteServiceName;

    @NameInMap("Result")
    public String result;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TestField1")
    public String testField1;

    @NameInMap("TraceId")
    public String traceId;

    public static ListDSTSpansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSTSpansRequest self = new ListDSTSpansRequest();
        return TeaModel.build(map, self);
    }

    public ListDSTSpansRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public ListDSTSpansRequest setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public ListDSTSpansRequest setCustomTags(java.util.List<ListDSTSpansRequestCustomTags> customTags) {
        this.customTags = customTags;
        return this;
    }
    public java.util.List<ListDSTSpansRequestCustomTags> getCustomTags() {
        return this.customTags;
    }

    public ListDSTSpansRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDSTSpansRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDSTSpansRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ListDSTSpansRequest setLocalServiceName(String localServiceName) {
        this.localServiceName = localServiceName;
        return this;
    }
    public String getLocalServiceName() {
        return this.localServiceName;
    }

    public ListDSTSpansRequest setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public Long getMaxDuration() {
        return this.maxDuration;
    }

    public ListDSTSpansRequest setMiddlewareTags(java.util.List<ListDSTSpansRequestMiddlewareTags> middlewareTags) {
        this.middlewareTags = middlewareTags;
        return this;
    }
    public java.util.List<ListDSTSpansRequestMiddlewareTags> getMiddlewareTags() {
        return this.middlewareTags;
    }

    public ListDSTSpansRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public ListDSTSpansRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTSpansRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTSpansRequest setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName;
        return this;
    }
    public String getRemoteServiceName() {
        return this.remoteServiceName;
    }

    public ListDSTSpansRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ListDSTSpansRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDSTSpansRequest setTestField1(String testField1) {
        this.testField1 = testField1;
        return this;
    }
    public String getTestField1() {
        return this.testField1;
    }

    public ListDSTSpansRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListDSTSpansRequestCustomTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTSpansRequestCustomTags build(java.util.Map<String, ?> map) throws Exception {
            ListDSTSpansRequestCustomTags self = new ListDSTSpansRequestCustomTags();
            return TeaModel.build(map, self);
        }

        public ListDSTSpansRequestCustomTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTSpansRequestCustomTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDSTSpansRequestMiddlewareTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTSpansRequestMiddlewareTags build(java.util.Map<String, ?> map) throws Exception {
            ListDSTSpansRequestMiddlewareTags self = new ListDSTSpansRequestMiddlewareTags();
            return TeaModel.build(map, self);
        }

        public ListDSTSpansRequestMiddlewareTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTSpansRequestMiddlewareTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
