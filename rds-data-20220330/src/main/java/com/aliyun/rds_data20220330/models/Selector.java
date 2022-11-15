// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class Selector extends TeaModel {
    @NameInMap("Eq")
    public String eq;

    @NameInMap("Ge")
    public String ge;

    @NameInMap("Gt")
    public String gt;

    @NameInMap("Le")
    public String le;

    @NameInMap("Like")
    public String like;

    @NameInMap("Lt")
    public String lt;

    @NameInMap("Ne")
    public String ne;

    public static Selector build(java.util.Map<String, ?> map) throws Exception {
        Selector self = new Selector();
        return TeaModel.build(map, self);
    }

    public Selector setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

    public Selector setGe(String ge) {
        this.ge = ge;
        return this;
    }
    public String getGe() {
        return this.ge;
    }

    public Selector setGt(String gt) {
        this.gt = gt;
        return this;
    }
    public String getGt() {
        return this.gt;
    }

    public Selector setLe(String le) {
        this.le = le;
        return this;
    }
    public String getLe() {
        return this.le;
    }

    public Selector setLike(String like) {
        this.like = like;
        return this;
    }
    public String getLike() {
        return this.like;
    }

    public Selector setLt(String lt) {
        this.lt = lt;
        return this;
    }
    public String getLt() {
        return this.lt;
    }

    public Selector setNe(String ne) {
        this.ne = ne;
        return this;
    }
    public String getNe() {
        return this.ne;
    }

}
