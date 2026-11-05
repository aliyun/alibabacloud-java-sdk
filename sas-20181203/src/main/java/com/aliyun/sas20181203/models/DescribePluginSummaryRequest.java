// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePluginSummaryRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
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
     * <li><p>alinet: AliNet.</p>
     * </li>
     * <li><p>alisecguard: Self-protection.</p>
     * </li>
     * <li><p>alihips: AliHips.</p>
     * </li>
     * <li><p>alidetect: AliDetect.</p>
     * </li>
     * <li><p>yundunmonitor: YundunMonitor.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required. If this parameter is not specified, the API returns HTTP 400 and the error code -101.</p>
     * </blockquote>
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
