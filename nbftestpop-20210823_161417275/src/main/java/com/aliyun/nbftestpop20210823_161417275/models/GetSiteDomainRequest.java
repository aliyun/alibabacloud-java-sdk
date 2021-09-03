// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210823_161417275.models;

import com.aliyun.tea.*;

public class GetSiteDomainRequest extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("age")
    public Integer age;

    @NameInMap("hostName")
    public String hostName;

    @NameInMap("regionType")
    public String regionType;

    @NameInMap("regionTypeName")
    public String regionTypeName;

    public static GetSiteDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteDomainRequest self = new GetSiteDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteDomainRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetSiteDomainRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public GetSiteDomainRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public GetSiteDomainRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public GetSiteDomainRequest setRegionTypeName(String regionTypeName) {
        this.regionTypeName = regionTypeName;
        return this;
    }
    public String getRegionTypeName() {
        return this.regionTypeName;
    }

}
