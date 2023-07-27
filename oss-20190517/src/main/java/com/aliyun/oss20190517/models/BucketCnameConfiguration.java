// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketCnameConfiguration extends TeaModel {
    @NameInMap("Cname")
    public Cname cname;

    public static BucketCnameConfiguration build(java.util.Map<String, ?> map) throws Exception {
        BucketCnameConfiguration self = new BucketCnameConfiguration();
        return TeaModel.build(map, self);
    }

    public BucketCnameConfiguration setCname(Cname cname) {
        this.cname = cname;
        return this;
    }
    public Cname getCname() {
        return this.cname;
    }

    public static class Cname extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        public static Cname build(java.util.Map<String, ?> map) throws Exception {
            Cname self = new Cname();
            return TeaModel.build(map, self);
        }

        public Cname setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
