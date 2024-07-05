// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePresetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Presets")
    public java.util.List<DescribePresetsResponseBodyPresets> presets;

    /**
     * <strong>example:</strong>
     * <p>9FE0CA83-BFD3-4EBD-A429-FABB9B9AE772</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribePresetsResponseBody setPresets(java.util.List<DescribePresetsResponseBodyPresets> presets) {
        this.presets = presets;
        return this;
    }
    public java.util.List<DescribePresetsResponseBodyPresets> getPresets() {
        return this.presets;
    }

    public DescribePresetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePresetsResponseBodyPresets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static DescribePresetsResponseBodyPresets build(java.util.Map<String, ?> map) throws Exception {
            DescribePresetsResponseBodyPresets self = new DescribePresetsResponseBodyPresets();
            return TeaModel.build(map, self);
        }

        public DescribePresetsResponseBodyPresets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePresetsResponseBodyPresets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
