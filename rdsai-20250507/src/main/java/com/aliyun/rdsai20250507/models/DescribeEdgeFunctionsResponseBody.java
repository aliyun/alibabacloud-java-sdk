// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeEdgeFunctionsResponseBody extends TeaModel {
    /**
     * <p>The list of edge functions.</p>
     */
    @NameInMap("EdgeFunctions")
    public java.util.List<DescribeEdgeFunctionsResponseBodyEdgeFunctions> edgeFunctions;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEdgeFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeFunctionsResponseBody self = new DescribeEdgeFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeFunctionsResponseBody setEdgeFunctions(java.util.List<DescribeEdgeFunctionsResponseBodyEdgeFunctions> edgeFunctions) {
        this.edgeFunctions = edgeFunctions;
        return this;
    }
    public java.util.List<DescribeEdgeFunctionsResponseBodyEdgeFunctions> getEdgeFunctions() {
        return this.edgeFunctions;
    }

    public DescribeEdgeFunctionsResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeEdgeFunctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEdgeFunctionsResponseBodyEdgeFunctions extends TeaModel {
        /**
         * <p>The number of vCPUs used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The time when the function was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-12T21:35:03</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The edge function name.</p>
         * 
         * <strong>example:</strong>
         * <p>ef-****</p>
         */
        @NameInMap("EdgeFunctionName")
        public String edgeFunctionName;

        /**
         * <p>The URL for accessing the function.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://fcnext.console.aliyun.com/cn-beijing/functions/fc">https://fcnext.console.aliyun.com/cn-beijing/functions/fc</a>****</p>
         */
        @NameInMap("FunctionUrl")
        public String functionUrl;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The time when the function was last created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-25 10:22:54 +0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The runtime environment for the function, which includes the Linux environment and the Deno version.</p>
         * 
         * <strong>example:</strong>
         * <p>custom.debian12-deno-2.5.6</p>
         */
        @NameInMap("Runtime")
        public String runtime;

        /**
         * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/2623972.html">Instance state table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The public URL for accessing the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://fc-bfvmoi****.cn-beijing.fcapp.run">https://fc-bfvmoi****.cn-beijing.fcapp.run</a></p>
         */
        @NameInMap("UrlInternet")
        public String urlInternet;

        /**
         * <p>The internal URL for accessing the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://fc-bfvmoi****.cn-beijing-vpc.fcapp.run">https://fc-bfvmoi****.cn-beijing-vpc.fcapp.run</a></p>
         */
        @NameInMap("UrlIntranet")
        public String urlIntranet;

        public static DescribeEdgeFunctionsResponseBodyEdgeFunctions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeFunctionsResponseBodyEdgeFunctions self = new DescribeEdgeFunctionsResponseBodyEdgeFunctions();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setEdgeFunctionName(String edgeFunctionName) {
            this.edgeFunctionName = edgeFunctionName;
            return this;
        }
        public String getEdgeFunctionName() {
            return this.edgeFunctionName;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setFunctionUrl(String functionUrl) {
            this.functionUrl = functionUrl;
            return this;
        }
        public String getFunctionUrl() {
            return this.functionUrl;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public DescribeEdgeFunctionsResponseBodyEdgeFunctions setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

    }

}
