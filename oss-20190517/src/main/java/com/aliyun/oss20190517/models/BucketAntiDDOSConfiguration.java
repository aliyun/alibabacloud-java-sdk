// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketAntiDDOSConfiguration extends TeaModel {
    @NameInMap("Cnames")
    public Cnames cnames;

    public static BucketAntiDDOSConfiguration build(java.util.Map<String, ?> map) throws Exception {
        BucketAntiDDOSConfiguration self = new BucketAntiDDOSConfiguration();
        return TeaModel.build(map, self);
    }

    public BucketAntiDDOSConfiguration setCnames(Cnames cnames) {
        this.cnames = cnames;
        return this;
    }
    public Cnames getCnames() {
        return this.cnames;
    }

    public static class Cnames extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<String> domain;

        public static Cnames build(java.util.Map<String, ?> map) throws Exception {
            Cnames self = new Cnames();
            return TeaModel.build(map, self);
        }

        public Cnames setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

    }

}
