// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSophonCommandsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSophonCommandsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSophonCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSophonCommandsResponseBody self = new DescribeSophonCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSophonCommandsResponseBody setData(java.util.List<DescribeSophonCommandsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSophonCommandsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSophonCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSophonCommandsResponseBodyDataParamConfig extends TeaModel {
        @NameInMap("CheckField")
        public String checkField;

        @NameInMap("Field")
        public String field;

        @NameInMap("Necessary")
        public Boolean necessary;

        @NameInMap("Value")
        public String value;

        public static DescribeSophonCommandsResponseBodyDataParamConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeSophonCommandsResponseBodyDataParamConfig self = new DescribeSophonCommandsResponseBodyDataParamConfig();
            return TeaModel.build(map, self);
        }

        public DescribeSophonCommandsResponseBodyDataParamConfig setCheckField(String checkField) {
            this.checkField = checkField;
            return this;
        }
        public String getCheckField() {
            return this.checkField;
        }

        public DescribeSophonCommandsResponseBodyDataParamConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeSophonCommandsResponseBodyDataParamConfig setNecessary(Boolean necessary) {
            this.necessary = necessary;
            return this;
        }
        public Boolean getNecessary() {
            return this.necessary;
        }

        public DescribeSophonCommandsResponseBodyDataParamConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSophonCommandsResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParamConfig")
        public java.util.List<DescribeSophonCommandsResponseBodyDataParamConfig> paramConfig;

        public static DescribeSophonCommandsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSophonCommandsResponseBodyData self = new DescribeSophonCommandsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSophonCommandsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSophonCommandsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeSophonCommandsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSophonCommandsResponseBodyData setParamConfig(java.util.List<DescribeSophonCommandsResponseBodyDataParamConfig> paramConfig) {
            this.paramConfig = paramConfig;
            return this;
        }
        public java.util.List<DescribeSophonCommandsResponseBodyDataParamConfig> getParamConfig() {
            return this.paramConfig;
        }

    }

}
