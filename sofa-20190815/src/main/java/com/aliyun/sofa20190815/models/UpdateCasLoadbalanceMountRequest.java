// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasLoadbalanceMountRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Id")
    public String id;

    @NameInMap("MountMap")
    public java.util.List<UpdateCasLoadbalanceMountRequestMountMap> mountMap;

    public static UpdateCasLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasLoadbalanceMountRequest self = new UpdateCasLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasLoadbalanceMountRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateCasLoadbalanceMountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCasLoadbalanceMountRequest setMountMap(java.util.List<UpdateCasLoadbalanceMountRequestMountMap> mountMap) {
        this.mountMap = mountMap;
        return this;
    }
    public java.util.List<UpdateCasLoadbalanceMountRequestMountMap> getMountMap() {
        return this.mountMap;
    }

    public static class UpdateCasLoadbalanceMountRequestMountMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Long value;

        public static UpdateCasLoadbalanceMountRequestMountMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateCasLoadbalanceMountRequestMountMap self = new UpdateCasLoadbalanceMountRequestMountMap();
            return TeaModel.build(map, self);
        }

        public UpdateCasLoadbalanceMountRequestMountMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateCasLoadbalanceMountRequestMountMap setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
