// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListDiagnosisResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnosis</p>
     * 
     * <strong>example:</strong>
     * <p>44841312-7227-55C9-AE03-D59729BFAE38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code  </p>
     * <ul>
     * <li><code>code == Success</code> indicates successful authorization;  </li>
     * <li>Other status codes indicate failed authorization. When authorization fails, view the <code>message</code> field to obtain detailed error information;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public java.util.List<ListDiagnosisResponseBodyData> data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>319</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisResponseBody self = new ListDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDiagnosisResponseBody setData(java.util.List<ListDiagnosisResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDiagnosisResponseBodyData> getData() {
        return this.data;
    }

    public ListDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDiagnosisResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListDiagnosisResponseBodyData extends TeaModel {
        /**
         * <p>Diagnosis error code; 0 indicates no error</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public Integer code;

        /**
         * <p>Diagnostic command</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;jobs&quot;:[
         *         {
         *             &quot;cmd&quot;:&quot;mkdir -p /var/log/sysak &amp;&amp; sysak podmem -r 100  -a -j /var/log/sysak/podmem.json &gt; /dev/null 2&gt;&amp;1 &amp;&amp; cat /var/log/sysak/podmem.json&quot;,
         *             &quot;instance&quot;:&quot;172.20.12.174&quot;,
         *             &quot;fetch_file_list&quot;:[</p>
         * <pre><code>        ]
         *     }
         * ],
         * &quot;in_order&quot;:true,
         * &quot;offline_mode&quot;:false,
         * &quot;offline_results&quot;:[
         * 
         * ]
         * </code></pre>
         * <p>}</p>
         */
        @NameInMap("command")
        public Object command;

        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-25T15:08:19</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Diagnosis failed</p>
         */
        @NameInMap("err_msg")
        public String errMsg;

        /**
         * <p>Diagnosis parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;type&quot;:&quot;all&quot;,
         *     &quot;value&quot;:&quot;&quot;,
         *     &quot;channel&quot;:&quot;ssh&quot;,
         *     &quot;instance&quot;:&quot;172.1.2.174&quot;,
         *     &quot;service_name&quot;:&quot;filecache&quot;
         * }</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <p>Diagnosis result</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;summary&quot;:&quot;  memory cgroup leak&quot;,
         *     &quot;dataMemEvent&quot;:{
         *         &quot;data&quot;:[
         *             {
         *                 &quot;key&quot;:&quot;Util&quot;,
         *                 &quot;value&quot;:20
         *             },
         *             {
         *                 &quot;key&quot;:&quot;MemLeak&quot;,
         *                 &quot;value&quot;:&quot;OK&quot;
         *             },
         *             {
         *                 &quot;key&quot;:&quot;MemcgLeak&quot;,
         *                 &quot;value&quot;:&quot;NG&quot;
         *             },
         *             {
         *                 &quot;key&quot;:&quot;MemFrag&quot;,
         *                 &quot;value&quot;:&quot;OK&quot;
         *             }
         *         ]
         *     },
         *     &quot;dataMemOverView&quot;:{
         *         &quot;data&quot;:[
         *             {
         *                 &quot;key&quot;:&quot;app&quot;,
         *                 &quot;value&quot;:10937332
         *             },
         *             {
         *                 &quot;key&quot;:&quot;free&quot;,
         *                 &quot;value&quot;:806800
         *             },
         *             {
         *                 &quot;key&quot;:&quot;kernel&quot;,
         *                 &quot;value&quot;:4527660
         *             }
         *         ]
         *     },
         *     &quot;dataKerMem&quot;:{
         *         &quot;data&quot;:[
         *             {
         *                 &quot;key&quot;:&quot;SReclaimable&quot;,
         *                 &quot;value&quot;:3411292
         *             },
         *             {
         *                 &quot;key&quot;:&quot;VmallocUsed&quot;,
         *                 &quot;value&quot;:30980
         *             },
         *             {
         *                 &quot;key&quot;:&quot;allocPage&quot;,
         *                 &quot;value&quot;:177732
         *             },
         *             {
         *                 &quot;key&quot;:&quot;KernelStack&quot;,
         *                 &quot;value&quot;:9280
         *             },
         *             {
         *                 &quot;key&quot;:&quot;PageTables&quot;,
         *                 &quot;value&quot;:38056
         *             },
         *             {
         *                 &quot;key&quot;:&quot;SUnreclaim&quot;,
         *                 &quot;value&quot;:170248
         *             },
         *             {
         *                 &quot;key&quot;:&quot;reserved&quot;,
         *                 &quot;value&quot;:690072
         *             }
         *         ]
         *     },
         *     &quot;dataUserMem&quot;:{
         *         &quot;data&quot;:[
         *             {
         *                 &quot;key&quot;:&quot;filecache&quot;,
         *                 &quot;value&quot;:8010008
         *             },
         *             {
         *                 &quot;key&quot;:&quot;anon&quot;,
         *                 &quot;value&quot;:2468608
         *             },
         *             {
         *                 &quot;key&quot;:&quot;mlock&quot;,
         *                 &quot;value&quot;:0
         *             },
         *             {
         *                 &quot;key&quot;:&quot;huge1G&quot;,
         *                 &quot;value&quot;:0
         *             },
         *             {
         *                 &quot;key&quot;:&quot;huge2M&quot;,
         *                 &quot;value&quot;:0
         *             },
         *             {
         *                 &quot;key&quot;:&quot;buffers&quot;,
         *                 &quot;value&quot;:458608
         *             },
         *             {
         *                 &quot;key&quot;:&quot;shmem&quot;,
         *                 &quot;value&quot;:2284
         *             }
         *         ]
         *     },
         *     &quot;dataCacheList&quot;:{
         *         &quot;data&quot;:[
         *             {
         *                 &quot;key&quot;:0,
         *                 &quot;Name&quot;:&quot;/var/lib/mysql/sysom/sys_handler_log.ibd&quot;,
         *                 &quot;cached&quot;:576764,
         *                 &quot;Task&quot;:&quot;mysqld_78575 &quot;
         *             },
         *             {
         *                 &quot;key&quot;:1,
         *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-migration-access.log&quot;,
         *                 &quot;cached&quot;:276688,
         *                 &quot;Task&quot;:&quot;gunicorn_33647 ,gunicorn_460836 ,gunicorn_559934 ,gunicorn_731758 ,gunicorn_2362682 &quot;
         *             },
         *             {
         *                 &quot;key&quot;:2,
         *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-rtdemo-access.log&quot;,
         *                 &quot;cached&quot;:229404,
         *                 &quot;Task&quot;:&quot;gunicorn_60718 ,gunicorn_720734 ,gunicorn_722168 &quot;
         *             },
         *             {
         *                 &quot;key&quot;:3,
         *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-monitor-server-access.log&quot;,
         *                 &quot;cached&quot;:197368,
         *                 &quot;Task&quot;:&quot;gunicorn_33682 ,gunicorn_671155 ,gunicorn_714998 &quot;
         *             },
         *             {
         *                 &quot;key&quot;:4,
         *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-channel-access.log&quot;,
         *                 &quot;cached&quot;:180276,
         *                 &quot;Task&quot;:&quot;gunicorn_33233 ,gunicorn_499735 ,gunicorn_725497 &quot;
         *             },
         *             {
         *                 &quot;key&quot;:5,
         *                 &quot;Name&quot;:&quot;total cached of close file&quot;,
         *                 &quot;cached&quot;:3729668,
         *                 &quot;Task&quot;:&quot;&quot;
         *             }
         *         ]
         *     },
         *     &quot;dataProcMemList&quot;:{
         *         &quot;data&quot;:[
         *             {
         *                 &quot;key&quot;:0,
         *                 &quot;task&quot;:&quot;mysqld&quot;,
         *                 &quot;MemTotal&quot;:240856,
         *                 &quot;RssAnon&quot;:218248,
         *                 &quot;RssFile&quot;:22608
         *             },
         *             {
         *                 &quot;key&quot;:1,
         *                 &quot;task&quot;:&quot;systemd-journal&quot;,
         *                 &quot;MemTotal&quot;:150248,
         *                 &quot;RssAnon&quot;:74300,
         *                 &quot;RssFile&quot;:75944
         *             },
         *             {
         *                 &quot;key&quot;:2,
         *                 &quot;task&quot;:&quot;gunicorn&quot;,
         *                 &quot;MemTotal&quot;:144640,
         *                 &quot;RssAnon&quot;:114200,
         *                 &quot;RssFile&quot;:30440
         *             },
         *             {
         *                 &quot;key&quot;:3,
         *                 &quot;task&quot;:&quot;gunicorn&quot;,
         *                 &quot;MemTotal&quot;:141480,
         *                 &quot;RssAnon&quot;:111040,
         *                 &quot;RssFile&quot;:30440
         *             },
         *             {
         *                 &quot;key&quot;:4,
         *                 &quot;task&quot;:&quot;grafana-server&quot;,
         *                 &quot;MemTotal&quot;:103660,
         *                 &quot;RssAnon&quot;:42732,
         *                 &quot;RssFile&quot;:60928
         *             },
         *             {
         *                 &quot;key&quot;:5,
         *                 &quot;task&quot;:&quot;gunicorn&quot;,
         *                 &quot;MemTotal&quot;:97444,
         *                 &quot;RssAnon&quot;:76256,
         *                 &quot;RssFile&quot;:21188
         *             },
         *             {
         *                 &quot;key&quot;:6,
         *                 &quot;task&quot;:&quot;gunicorn&quot;,
         *                 &quot;MemTotal&quot;:97260,
         *                 &quot;RssAnon&quot;:76072,
         *                 &quot;RssFile&quot;:21188
         *             },
         *             {
         *                 &quot;key&quot;:7,
         *                 &quot;task&quot;:&quot;prometheus&quot;,
         *                 &quot;MemTotal&quot;:95356,
         *                 &quot;RssAnon&quot;:45376,
         *                 &quot;RssFile&quot;:49980
         *             },
         *             {
         *                 &quot;key&quot;:8,
         *                 &quot;task&quot;:&quot;gunicorn&quot;,
         *                 &quot;MemTotal&quot;:90144,
         *                 &quot;RssAnon&quot;:76456,
         *                 &quot;RssFile&quot;:13688
         *             },
         *             {
         *                 &quot;key&quot;:9,
         *                 &quot;task&quot;:&quot;gunicorn&quot;,
         *                 &quot;MemTotal&quot;:89796,
         *                 &quot;RssAnon&quot;:76108,
         *                 &quot;RssFile&quot;:13688
         *             }
         *         ]
         *     }
         * }</p>
         */
        @NameInMap("result")
        public Object result;

        /**
         * <p>Diagnosis Type</p>
         * 
         * <strong>example:</strong>
         * <p>memgraph</p>
         */
        @NameInMap("service_name")
        public String serviceName;

        /**
         * <p>Status of the diagnostic task execution.<br>Valid values:  </p>
         * <ul>
         * <li><strong>Ready</strong>: Ready  </li>
         * <li><strong>Running</strong>: Running  </li>
         * <li><strong>Success</strong>: Succeeded  </li>
         * <li><strong>Fail</strong>: Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>grcuU21a</p>
         */
        @NameInMap("task_id")
        public String taskId;

        /**
         * <p>Update Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-25T15:08:19</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        /**
         * <p>Diagnostic details URL</p>
         * 
         * <strong>example:</strong>
         * <p>/diagnose/detail/qe3Z34sa</p>
         */
        @NameInMap("url")
        public String url;

        public static ListDiagnosisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnosisResponseBodyData self = new ListDiagnosisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDiagnosisResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListDiagnosisResponseBodyData setCommand(Object command) {
            this.command = command;
            return this;
        }
        public Object getCommand() {
            return this.command;
        }

        public ListDiagnosisResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDiagnosisResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ListDiagnosisResponseBodyData setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public ListDiagnosisResponseBodyData setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public ListDiagnosisResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListDiagnosisResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDiagnosisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListDiagnosisResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListDiagnosisResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
