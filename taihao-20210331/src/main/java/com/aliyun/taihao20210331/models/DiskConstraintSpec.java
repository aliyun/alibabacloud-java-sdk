// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DiskConstraintSpec extends TeaModel {
    // defaultValue
    @NameInMap("defaultValue")
    public Long defaultValue;

    // end
    @NameInMap("end")
    public Long end;

    // start
    @NameInMap("start")
    public Long start;

    // step
    @NameInMap("step")
    public Long step;

    // type
    @NameInMap("type")
    public String type;

    public static DiskConstraintSpec build(java.util.Map<String, ?> map) throws Exception {
        DiskConstraintSpec self = new DiskConstraintSpec();
        return TeaModel.build(map, self);
    }

    public DiskConstraintSpec setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public Long getDefaultValue() {
        return this.defaultValue;
    }

    public DiskConstraintSpec setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public DiskConstraintSpec setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public DiskConstraintSpec setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public DiskConstraintSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
