// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The default configuration parameters of the instance. To view the full list of parameters, call the <a href="https://help.aliyun.com/document_detail/473847.html">DescribeParameters</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;list-max-ziplist-entries\&quot;:512,\&quot;list-max-ziplist-value\&quot;:64,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether to enable Sentinel compatibility mode. This parameter applies only to non-cluster instances. Valid values:</p>
     * <ul>
     * <li><p><strong>no</strong> (default): Disabled</p>
     * </li>
     * <li><p><strong>yes</strong>: Enabled</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("ParamNoLooseSentinelEnabled")
    public String paramNoLooseSentinelEnabled;

    /**
     * <p>Specifies whether to allow password-free execution of Sentinel commands when Sentinel compatibility mode is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>no</strong> (default): Disabled.</p>
     * </li>
     * <li><p><strong>yes</strong>: Enabled. Allows you to run Sentinel commands on any connection without a password and use the <code>SENTINEL</code> command to subscribe to the <code>+switch-master</code> channel.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    public String paramNoLooseSentinelPasswordFreeAccess;

    /**
     * <p>Additional commands that can be run without a password. This parameter is valid only when Sentinel compatibility mode is enabled and <code>ParamNoLooseSentinelPasswordFreeAccess</code> is set to <code>yes</code>. By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    public String paramNoLooseSentinelPasswordFreeCommands;

    /**
     * <p>The replication mode. Valid values:</p>
     * <ul>
     * <li><p><strong>async</strong> (default): asynchronous mode</p>
     * </li>
     * <li><p><strong>semisync</strong>: semi-synchronous mode</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ParamReplMode")
    public String paramReplMode;

    /**
     * <p>The degradation threshold for the semi-synchronous mode. This parameter is valid only in semi-synchronous mode. Unit: milliseconds. Valid values: 10 to 60000. Default value: 500.</p>
     * <blockquote>
     * <p>If replication latency exceeds this threshold, the replication mode degrades to asynchronous mode. When the replication latency returns to normal, the mode reverts to semi-synchronous mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ParamReplTimeout")
    public String paramReplTimeout;

    /**
     * <p>Specifies whether to enable Sentinel compatibility mode. This parameter applies to instances that use the cluster architecture with proxy connection mode or the read/write splitting architecture. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): Disabled</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
     * </blockquote>
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
