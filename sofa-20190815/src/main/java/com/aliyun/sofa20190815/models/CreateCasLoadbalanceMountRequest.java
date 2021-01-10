// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceMountRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Id")
    public String id;

    @NameInMap("MountMap")
    public java.util.List<CreateCasLoadbalanceMountRequestMountMap> mountMap;

    public static CreateCasLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceMountRequest self = new CreateCasLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceMountRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCasLoadbalanceMountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCasLoadbalanceMountRequest setMountMap(java.util.List<CreateCasLoadbalanceMountRequestMountMap> mountMap) {
        this.mountMap = mountMap;
        return this;
    }
    public java.util.List<CreateCasLoadbalanceMountRequestMountMap> getMountMap() {
        return this.mountMap;
    }

    public static class CreateCasLoadbalanceMountRequestMountMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Long value;

        public static CreateCasLoadbalanceMountRequestMountMap build(java.util.Map<String, ?> map) throws Exception {
            CreateCasLoadbalanceMountRequestMountMap self = new CreateCasLoadbalanceMountRequestMountMap();
            return TeaModel.build(map, self);
        }

        public CreateCasLoadbalanceMountRequestMountMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCasLoadbalanceMountRequestMountMap setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
