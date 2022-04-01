// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class MainVersionApplicationParam extends TeaModel {
    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // applicationVersion
    @NameInMap("applicationVersion")
    public String applicationVersion;

    // display
    @NameInMap("display")
    public String display;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // mandatory
    @NameInMap("mandatory")
    public String mandatory;

    public static MainVersionApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        MainVersionApplicationParam self = new MainVersionApplicationParam();
        return TeaModel.build(map, self);
    }

    public MainVersionApplicationParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public MainVersionApplicationParam setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }
    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public MainVersionApplicationParam setDisplay(String display) {
        this.display = display;
        return this;
    }
    public String getDisplay() {
        return this.display;
    }

    public MainVersionApplicationParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public MainVersionApplicationParam setMandatory(String mandatory) {
        this.mandatory = mandatory;
        return this;
    }
    public String getMandatory() {
        return this.mandatory;
    }

}
