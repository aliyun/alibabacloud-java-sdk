// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshesRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<DescribeServiceMeshesRequestTag> tag;

    public static DescribeServiceMeshesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshesRequest self = new DescribeServiceMeshesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshesRequest setTag(java.util.List<DescribeServiceMeshesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeServiceMeshesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeServiceMeshesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeServiceMeshesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesRequestTag self = new DescribeServiceMeshesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeServiceMeshesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
