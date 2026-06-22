// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientAlertModeRequest extends TeaModel {
    /**
     * <p>The protection mode. Valid values:</p>
     * <ul>
     * <li><strong>strict</strong>: Strict mode. Defense mode has a risk of false positives. Use Defense mode during critical event protection periods.</li>
     * <li><strong>balance</strong>: Balance mode. Defense mode detects more suspicious risks while reducing false positives.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>strict</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static ListClientAlertModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientAlertModeRequest self = new ListClientAlertModeRequest();
        return TeaModel.build(map, self);
    }

    public ListClientAlertModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
