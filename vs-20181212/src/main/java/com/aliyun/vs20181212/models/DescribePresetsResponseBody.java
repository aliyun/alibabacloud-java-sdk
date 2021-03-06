// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePresetsResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Presets")
    public java.util.List<DescribePresetsResponseBodyPresets> presets;

    public static DescribePresetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePresetsResponseBody self = new DescribePresetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePresetsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribePresetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePresetsResponseBody setPresets(java.util.List<DescribePresetsResponseBodyPresets> presets) {
        this.presets = presets;
        return this;
    }
    public java.util.List<DescribePresetsResponseBodyPresets> getPresets() {
        return this.presets;
    }

    public static class DescribePresetsResponseBodyPresets extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribePresetsResponseBodyPresets build(java.util.Map<String, ?> map) throws Exception {
            DescribePresetsResponseBodyPresets self = new DescribePresetsResponseBodyPresets();
            return TeaModel.build(map, self);
        }

        public DescribePresetsResponseBodyPresets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePresetsResponseBodyPresets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
