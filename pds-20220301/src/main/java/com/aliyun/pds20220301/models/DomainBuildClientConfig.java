// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DomainBuildClientConfig extends TeaModel {
    @NameInMap("copyright")
    public String copyright;

    @NameInMap("name")
    public String name;

    public static DomainBuildClientConfig build(java.util.Map<String, ?> map) throws Exception {
        DomainBuildClientConfig self = new DomainBuildClientConfig();
        return TeaModel.build(map, self);
    }

    public DomainBuildClientConfig setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }
    public String getCopyright() {
        return this.copyright;
    }

    public DomainBuildClientConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
