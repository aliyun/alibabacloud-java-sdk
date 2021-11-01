// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectFrame extends TeaModel {
    // 结果集
    @NameInMap("Elements")
    public java.util.List<DetectObjectElement> elements;

    // 时间
    @NameInMap("Time")
    public Long time;

    public static DetectObjectFrame build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectFrame self = new DetectObjectFrame();
        return TeaModel.build(map, self);
    }

    public DetectObjectFrame setElements(java.util.List<DetectObjectElement> elements) {
        this.elements = elements;
        return this;
    }
    public java.util.List<DetectObjectElement> getElements() {
        return this.elements;
    }

    public DetectObjectFrame setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
