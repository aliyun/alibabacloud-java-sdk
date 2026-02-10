// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class WelcomeBlock extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayType")
    public String displayType;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("Label")
    public String label;

    @NameInMap("Type")
    public String type;

    @NameInMap("Value")
    public String value;

    public static WelcomeBlock build(java.util.Map<String, ?> map) throws Exception {
        WelcomeBlock self = new WelcomeBlock();
        return TeaModel.build(map, self);
    }

    public WelcomeBlock setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public WelcomeBlock setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }
    public String getDisplayType() {
        return this.displayType;
    }

    public WelcomeBlock setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public WelcomeBlock setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public WelcomeBlock setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WelcomeBlock setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
