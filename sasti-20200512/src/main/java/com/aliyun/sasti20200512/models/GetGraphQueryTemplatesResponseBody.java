// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class GetGraphQueryTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetGraphQueryTemplatesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetGraphQueryTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGraphQueryTemplatesResponseBody self = new GetGraphQueryTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGraphQueryTemplatesResponseBody setData(java.util.List<GetGraphQueryTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetGraphQueryTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public GetGraphQueryTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGraphQueryTemplatesResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GremlinTemplate")
        public String gremlinTemplate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastModifier")
        public String lastModifier;

        @NameInMap("Scenario")
        public String scenario;

        @NameInMap("ScenarioDesc")
        public String scenarioDesc;

        @NameInMap("Status")
        public Integer status;

        public static GetGraphQueryTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGraphQueryTemplatesResponseBodyData self = new GetGraphQueryTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGraphQueryTemplatesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGraphQueryTemplatesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGraphQueryTemplatesResponseBodyData setGremlinTemplate(String gremlinTemplate) {
            this.gremlinTemplate = gremlinTemplate;
            return this;
        }
        public String getGremlinTemplate() {
            return this.gremlinTemplate;
        }

        public GetGraphQueryTemplatesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGraphQueryTemplatesResponseBodyData setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetGraphQueryTemplatesResponseBodyData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetGraphQueryTemplatesResponseBodyData setScenarioDesc(String scenarioDesc) {
            this.scenarioDesc = scenarioDesc;
            return this;
        }
        public String getScenarioDesc() {
            return this.scenarioDesc;
        }

        public GetGraphQueryTemplatesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
