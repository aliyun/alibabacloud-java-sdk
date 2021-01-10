// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeprecateBuildpackRequest extends TeaModel {
    @NameInMap("DepracationNoteMapJsonStr")
    public String depracationNoteMapJsonStr;

    @NameInMap("IdRepeatList")
    public java.util.List<String> idRepeatList;

    public static DeprecateBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeprecateBuildpackRequest self = new DeprecateBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public DeprecateBuildpackRequest setDepracationNoteMapJsonStr(String depracationNoteMapJsonStr) {
        this.depracationNoteMapJsonStr = depracationNoteMapJsonStr;
        return this;
    }
    public String getDepracationNoteMapJsonStr() {
        return this.depracationNoteMapJsonStr;
    }

    public DeprecateBuildpackRequest setIdRepeatList(java.util.List<String> idRepeatList) {
        this.idRepeatList = idRepeatList;
        return this;
    }
    public java.util.List<String> getIdRepeatList() {
        return this.idRepeatList;
    }

}
