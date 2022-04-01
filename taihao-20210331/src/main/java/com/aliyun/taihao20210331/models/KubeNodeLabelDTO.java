// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class KubeNodeLabelDTO extends TeaModel {
    @NameInMap("label")
    public Label label;

    @NameInMap("taint")
    public Taint taint;

    public static KubeNodeLabelDTO build(java.util.Map<String, ?> map) throws Exception {
        KubeNodeLabelDTO self = new KubeNodeLabelDTO();
        return TeaModel.build(map, self);
    }

    public KubeNodeLabelDTO setLabel(Label label) {
        this.label = label;
        return this;
    }
    public Label getLabel() {
        return this.label;
    }

    public KubeNodeLabelDTO setTaint(Taint taint) {
        this.taint = taint;
        return this;
    }
    public Taint getTaint() {
        return this.taint;
    }

}
