// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestExperimentResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeABTestExperimentResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeABTestExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeABTestExperimentResponseBody self = new DescribeABTestExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeABTestExperimentResponseBody setResult(DescribeABTestExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeABTestExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeABTestExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeABTestExperimentResponseBodyResultParams extends TeaModel {
        @NameInMap("first_formula_name")
        public String firstFormulaName;

        public static DescribeABTestExperimentResponseBodyResultParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeABTestExperimentResponseBodyResultParams self = new DescribeABTestExperimentResponseBodyResultParams();
            return TeaModel.build(map, self);
        }

        public DescribeABTestExperimentResponseBodyResultParams setFirstFormulaName(String firstFormulaName) {
            this.firstFormulaName = firstFormulaName;
            return this;
        }
        public String getFirstFormulaName() {
            return this.firstFormulaName;
        }

    }

    public static class DescribeABTestExperimentResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("params")
        public DescribeABTestExperimentResponseBodyResultParams params;

        @NameInMap("traffic")
        public Integer traffic;

        @NameInMap("online")
        public Boolean online;

        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("id")
        public String id;

        public static DescribeABTestExperimentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeABTestExperimentResponseBodyResult self = new DescribeABTestExperimentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeABTestExperimentResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeABTestExperimentResponseBodyResult setParams(DescribeABTestExperimentResponseBodyResultParams params) {
            this.params = params;
            return this;
        }
        public DescribeABTestExperimentResponseBodyResultParams getParams() {
            return this.params;
        }

        public DescribeABTestExperimentResponseBodyResult setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public DescribeABTestExperimentResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeABTestExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeABTestExperimentResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public DescribeABTestExperimentResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
