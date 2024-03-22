// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSophonCommandsResponseBody extends TeaModel {
    /**
     * <p>The commands.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSophonCommandsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The regular expression that is used to check the format of the parameter value. If the parameter is left empty, the check is not performed.</p>
         */
        @NameInMap("CheckField")
        public String checkField;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>Indicates whether the parameter is required. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Necessary")
        public Boolean necessary;

        /**
         * <p>The value of the parameter.</p>
         */
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
        /**
         * <p>The description of the command.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the command.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The name of the command.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter configurations.</p>
         */
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
