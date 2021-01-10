// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLDCOpsplanAppopstaskRequest extends TeaModel {
    @NameInMap("ActionCode")
    public String actionCode;

    @NameInMap("ControlType")
    public String controlType;

    @NameInMap("Id")
    public String id;

    public static ExecLDCOpsplanAppopstaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLDCOpsplanAppopstaskRequest self = new ExecLDCOpsplanAppopstaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecLDCOpsplanAppopstaskRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public ExecLDCOpsplanAppopstaskRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public ExecLDCOpsplanAppopstaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
