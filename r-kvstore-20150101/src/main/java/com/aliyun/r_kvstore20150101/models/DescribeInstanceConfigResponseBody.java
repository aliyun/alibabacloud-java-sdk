// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The default configuration parameters of the instance. For more comprehensive parameter settings, call the <a href="https://help.aliyun.com/document_detail/473847.html">DescribeParameters</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;list-max-ziplist-entries\&quot;:512,\&quot;list-max-ziplist-value\&quot;:64,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The Sentinel compatibility mode. This parameter applies to non-cluster instances. Valid values:</p>
     * <ul>
     * <li><strong>no</strong> (default): disabled.</li>
     * <li><strong>yes</strong>: enabled.<blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("ParamNoLooseSentinelEnabled")
    public String paramNoLooseSentinelEnabled;

    /**
     * <p>Specifies whether to allow password-free execution of Sentinel-related commands when Sentinel mode is enabled. Valid values:</p>
     * <ul>
     * <li><strong>no</strong> (default): disabled.</li>
     * <li><strong>yes</strong>: enabled. After this parameter is enabled, you can run Sentinel commands without a password on any connection and use the SENTINEL command to listen on the +switch-master channel.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    public String paramNoLooseSentinelPasswordFreeAccess;

    /**
     * <p>After Sentinel mode and the ParamNoLooseSentinelPasswordFreeAccess parameter are enabled, you can use this parameter to add additional password-free commands to the list. The default value is empty.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    public String paramNoLooseSentinelPasswordFreeCommands;

    /**
     * <p>The synchronization mode. Valid values:</p>
     * <ul>
     * <li><strong>async</strong> (default): asynchronous mode.</li>
     * <li><strong>semisync</strong>: semi-synchronous mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ParamReplMode")
    public String paramReplMode;

    /**
     * <p>The degradation threshold for semi-synchronous mode. This parameter can be configured only in semi-synchronous mode. Unit: ms. Valid values: 10 to 60000. Default value: 500.</p>
     * <blockquote>
     * <p>When the synchronization latency exceeds this threshold, the synchronization mode automatically switches to asynchronous mode. When the synchronization latency is eliminated, the synchronization mode automatically switches back to semi-synchronous mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ParamReplTimeout")
    public String paramReplTimeout;

    /**
     * <p>The Sentinel compatibility mode. This parameter applies to instances that use the proxy connection mode in cluster architecture or the read/write splitting architecture. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): disabled.</li>
     * <li><strong>1</strong>: enabled.<blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ParamSentinelCompatEnable")
    public String paramSentinelCompatEnable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E2C08F6-2D11-4ECD-9A4C-27EF2D3D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigResponseBody self = new DescribeInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeInstanceConfigResponseBody setParamNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
        this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
        return this;
    }
    public String getParamNoLooseSentinelEnabled() {
        return this.paramNoLooseSentinelEnabled;
    }

    public DescribeInstanceConfigResponseBody setParamNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
        this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
        return this;
    }
    public String getParamNoLooseSentinelPasswordFreeAccess() {
        return this.paramNoLooseSentinelPasswordFreeAccess;
    }

    public DescribeInstanceConfigResponseBody setParamNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
        this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
        return this;
    }
    public String getParamNoLooseSentinelPasswordFreeCommands() {
        return this.paramNoLooseSentinelPasswordFreeCommands;
    }

    public DescribeInstanceConfigResponseBody setParamReplMode(String paramReplMode) {
        this.paramReplMode = paramReplMode;
        return this;
    }
    public String getParamReplMode() {
        return this.paramReplMode;
    }

    public DescribeInstanceConfigResponseBody setParamReplTimeout(String paramReplTimeout) {
        this.paramReplTimeout = paramReplTimeout;
        return this;
    }
    public String getParamReplTimeout() {
        return this.paramReplTimeout;
    }

    public DescribeInstanceConfigResponseBody setParamSentinelCompatEnable(String paramSentinelCompatEnable) {
        this.paramSentinelCompatEnable = paramSentinelCompatEnable;
        return this;
    }
    public String getParamSentinelCompatEnable() {
        return this.paramSentinelCompatEnable;
    }

    public DescribeInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
