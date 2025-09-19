// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePluginSummaryRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response.**** Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the plug-in. Valid values:</p>
     * <ul>
     * <li>alinet: AliNet.</li>
     * <li>alisecguard: client protection.</li>
     * <li>alihips: AliHips.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alihips</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    public static DescribePluginSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginSummaryRequest self = new DescribePluginSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePluginSummaryRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

}
